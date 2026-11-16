package vn.edu.ute.baitapolop2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import vn.edu.ute.baitapolop2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataList = listOf(
            ItemModel("Lập trình Android", "Thực hành RecyclerView với Kotlin"),
            ItemModel("Cơ sở dữ liệu", "T-SQL và SQL Server Integration"),
            ItemModel("Mạng máy tính", "Windows Server 2016 & Active Directory"),
            ItemModel("Kiến trúc phần mềm", "Mô hình ViewBinding & Material Design")
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = ItemAdapter(dataList)
    }
}