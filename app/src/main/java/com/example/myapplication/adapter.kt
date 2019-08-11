package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class adapter(var context: Context, var hobbies: List<Hobby>) : RecyclerView.Adapter<adapter.my_view_holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): my_view_holder {
        var view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return my_view_holder(view)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    override fun onBindViewHolder(holder: my_view_holder, position: Int) {
        var hobby = hobbies[position]
        holder.setData(hobby, position)
    }

    inner class my_view_holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var current_hobby: Hobby? = null
        private var current_pos: Int = 0

        init {
            itemView.setOnClickListener {
                Toast.makeText(context, current_hobby!!.title + " clicked.", Toast.LENGTH_SHORT).show()
            }

            itemView.img_row.setOnClickListener {

                var msg: String = "My hobby is: " + current_hobby!!.title

                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT, msg)
                intent.type = "text/plan"

                context.startActivities(arrayOf(Intent.createChooser(intent, msg + " share to : ")))
            }
        }

        fun setData(hobby: Hobby?, pos: Int) {
//            itemView.txvTitle.text = hobby!!.title
            itemView.text_row.text = hobby!!.title

            this.current_hobby = hobby
            this.current_pos = pos
        }
    }
}