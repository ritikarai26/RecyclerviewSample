package view.activity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.xpert.myapplication.R
import model.TestSeriesModel
import java.util.ArrayList

class Custom_Adapter(val user: ArrayList<TestSeriesModel>):
    RecyclerView.Adapter<Custom_Adapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Custom_Adapter.ViewHolder {

            val v = LayoutInflater.from(parent.context).inflate(R.layout.test_series_item_layout, parent, false)
            return ViewHolder(v)



    }

    override fun getItemCount(): Int {
        return user.size
      //  TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: Custom_Adapter.ViewHolder, position: Int) {
      //  TODO("Not yet implemented")
        holder.bindItems(user[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(user: TestSeriesModel) {

            val textViewName = itemView.findViewById(R.id.question) as TextView
            val option1 = itemView.findViewById(R.id.option1) as RadioButton
            val option2 = itemView.findViewById(R.id.option2) as RadioButton
            val option3 = itemView.findViewById(R.id.option3) as RadioButton
            val option4  = itemView.findViewById(R.id.option4) as RadioButton
            textViewName.text = user.question
            option1.text = user.option1
            option2.text = user.option2
            option3.text = user.option3
            option4.text = user.option4


        }
    }

}