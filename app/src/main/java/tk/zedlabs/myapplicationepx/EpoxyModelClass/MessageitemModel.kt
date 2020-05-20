package tk.zedlabs.myapplicationepx.EpoxyModelClass

import android.view.View
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatTextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import tk.zedlabs.myapplicationepx.models.Message
import tk.zedlabs.myapplicationepx.R

@EpoxyModelClass(layout = R.layout.view_holder_message_item)
abstract class MessageItemModel : EpoxyModelWithHolder<MessageItemModel.Holder>() {

    @EpoxyAttribute
    lateinit var message: Message

    override fun bind(holder: Holder) {
        super.bind(holder)
        with(message) {
            holder.title.text = shopName
        }
    }

    class Holder : EpoxyHolder() {

        lateinit var profileImage: ImageView
        lateinit var title: AppCompatTextView
        lateinit var content: AppCompatTextView

        override fun bindView(itemView: View) {
            profileImage = itemView.findViewById(R.id.shop_image)
            title = itemView.findViewById(R.id.shop_name)
        }
    }
}