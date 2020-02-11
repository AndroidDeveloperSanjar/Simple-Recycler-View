package com.example.simplervexample.data

import com.example.simplervexample.model.User

class DataSource{

    companion object{

        fun createDataSet(): ArrayList<User>{
            val list = ArrayList<User>()
            list.add(
                User(
                    "https://i.imgur.com/8Lsx9kn.png",
                    "Universitetda o'qituvchi",
                    "Jamshid"
                )
            )
            list.add(
                User(
                    "https://i.imgur.com/IKQHuwF.png",
                    "Android dasturchi",
                    "Abbos"
                )
            )

            list.add(
                User(
                    "https://i.imgur.com/Nbtl4cs.png",
                    "Zavodda enjiner",
                    "Sanjar"
                )
            )
            list.add(
                User(
                    "https://i.imgur.com/VXWMiBF.jpg",
                    "Futbol o'yinchisi",
                    "Xurshid"
                )
            )
            list.add(
                User(
                    "https://i.imgur.com/LjJHuSm.jpg",
                    "Bankir",
                    "Sardor"
                )
            )
            list.add(
                User(
                    "https://i.imgur.com/5Ozse1c.png",
                    "Mashina haydovchisi",
                    "Zubaydullo"
                )
            )
            list.add(
                User(
                    "https://i.imgur.com/RMvwAKY.jpg",
                    "Universitetda talaba",
                    "Feruz"
                )
            )
            list.add(
                User(
                    "https://i.imgur.com/xZKxsil.png",
                    "Uy qurish biznesmeni",
                    "Murod"
                )
            )
            list.add(
                User(
                    "https://i.imgur.com/uTUbuY0.png",
                    "Middle Android Developer",
                    "Sanjar Karimov"
                )
            )
            return list
        }
    }
}