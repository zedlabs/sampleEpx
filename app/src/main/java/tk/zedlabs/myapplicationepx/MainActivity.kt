package tk.zedlabs.myapplicationepx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import tk.zedlabs.myapplicationepx.EpoxyController.ShopAndOrderController
import tk.zedlabs.myapplicationepx.models.Data

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val controller =
            ShopAndOrderController()
        messagesView.setController(controller)

        controller.shopList = Data.shopList
        controller.utilityList = Data.utilityList
        controller.dealList = Data.dealList
    }
}
