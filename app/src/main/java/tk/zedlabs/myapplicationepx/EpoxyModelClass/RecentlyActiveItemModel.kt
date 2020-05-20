package tk.zedlabs.myapplicationepx.EpoxyModelClass

import android.view.View
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatTextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import tk.zedlabs.myapplicationepx.models.Profile
import tk.zedlabs.myapplicationepx.R

@EpoxyModelClass(layout = R.layout.view_holder_recently_active_item)
abstract class RecentlyActiveItemModel : EpoxyModelWithHolder<RecentlyActiveItemModel.Holder>() {

    @EpoxyAttribute
    lateinit var profile: Profile

    override fun bind(holder: Holder) {
        super.bind(holder)
        with(profile) {
            holder.utilName.text = name
        }
    }

    class Holder : EpoxyHolder() {

        lateinit var utilImage: ImageView
        lateinit var utilName: AppCompatTextView

        override fun bindView(itemView: View) {
            utilImage = itemView.findViewById(R.id.utility_image)
            utilName = itemView.findViewById(R.id.utility_name)
        }
    }
}