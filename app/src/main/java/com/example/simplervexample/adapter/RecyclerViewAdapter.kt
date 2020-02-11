package com.example.simplervexample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.simplervexample.R
import com.example.simplervexample.model.User
import kotlinx.android.synthetic.main.item_rv.view.*

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    private var items: List<User> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return RecyclerViewViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_rv,
                parent,
                false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is RecyclerViewViewHolder -> {
                holder.run { bind(items[position]) }
            }
        }
    }

    override fun getItemCount(): Int = items.size


    fun submitList(blogList: List<User>){
        items = blogList
    }

    class RecyclerViewViewHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        private val userWorkingImage = itemView.image_view
        private val userWorking = itemView.tv_working
        private val userName = itemView.tv_username

        fun bind(user: User){

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.loading)
                .error(R.drawable.loading)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(user.image)
                .into(userWorkingImage)
            userWorking.text = user.working
            userName.text = user.username

        }

    }

}