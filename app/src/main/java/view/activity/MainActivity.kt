package view.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.xpert.myapplication.R
import model.TestSeriesModel
import view.activity.adapter.Custom_Adapter
import java.util.*

class MainActivity : AppCompatActivity() {
    //declare pojo class
    private var testSeriesModel: ArrayList<TestSeriesModel> = ArrayList<TestSeriesModel>()
    private var recyclerview:RecyclerView?=null;
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerview = findViewById(R.id.recyclerview1);


        recyclerview!!.layoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL,false)

         //declare  logo class with data

        testSeriesModel.add(TestSeriesModel("Q1.The least number, which when divided by 12, 15, 20 and 54 leaves in each case a remainder of 8 is:", "A.504",
                "B.504","C.504","D.504"))
        testSeriesModel.add(TestSeriesModel("Q2.The least number, which when divided by 12, 15, 20 and 54 leaves in each case a remainder of 8 is:", "A.504",
            "B504","C.504","D.504"))
        testSeriesModel.add(TestSeriesModel("Q3.The least number, which when divided by 12, 15, 20 and 54 leaves in each case a remainder of 8 is:", "A.504",
            "B504","C.504","D.504"))
        testSeriesModel.add(TestSeriesModel("Q4.The least number, which when divided by 12, 15, 20 and 54 leaves in each case a remainder of 8 is:", "A.504",
            "B504","C.504","D.504"))
        testSeriesModel.add(TestSeriesModel("Q5.The least number, which when divided by 12, 15, 20 and 54 leaves in each case a remainder of 8 is:", "A.504",
            "B504","C.504","D.504"))
        testSeriesModel.add(TestSeriesModel("Q6.The least number, which when divided by 12, 15, 20 and 54 leaves in each case a remainder of 8 is:", "A.504",
            "B504","C.504","D.504"))
          //call adapter class

        val adapter = Custom_Adapter(testSeriesModel)
        recyclerview!!.adapter = adapter

    }
}  