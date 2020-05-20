package tk.zedlabs.myapplicationepx.EpoxyModelClass

import android.view.View
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatTextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import tk.zedlabs.myapplicationepx.R
import tk.zedlabs.myapplicationepx.models.Deal

@EpoxyModelClass(layout = R.layout.view_holder_special_deals)
abstract class SpecialDealsModel : EpoxyModelWithHolder<SpecialDealsModel.Holder>() {

    @EpoxyAttribute
    lateinit var deal: Deal

    override fun bind(holder: Holder) {
        super.bind(holder)
        with(deal) {
            holder.dealName.text = shopNameDeal
            holder.dealText.text = dealText
        }
    }

    class Holder : EpoxyHolder() {

        lateinit var dealImage: ImageView
        lateinit var dealName: AppCompatTextView
        lateinit var dealText: AppCompatTextView

        override fun bindView(itemView: View) {
            dealImage = itemView.findViewById(R.id.deal_image)
            dealName = itemView.findViewById(R.id.deal_name)
            dealText = itemView.findViewById(R.id.deal_text)
        }
    }
}