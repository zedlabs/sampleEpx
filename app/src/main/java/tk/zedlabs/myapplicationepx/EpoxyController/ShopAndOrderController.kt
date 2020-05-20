package tk.zedlabs.myapplicationepx.EpoxyController

import com.airbnb.epoxy.AsyncEpoxyController
import com.airbnb.epoxy.Carousel
import com.airbnb.epoxy.carousel
import tk.zedlabs.myapplicationepx.EpoxyModelClass.*
import tk.zedlabs.myapplicationepx.models.Deal
import tk.zedlabs.myapplicationepx.models.Message
import tk.zedlabs.myapplicationepx.models.Profile

class ShopAndOrderController : AsyncEpoxyController() {

    var utilityList: List<Profile> = emptyList()
        set(value) {
            field = value
            requestModelBuild()
        }
    var shopList: List<Message> = emptyList()
        set(value) {
            field = value
            requestModelBuild()
        }
    var dealList: List<Deal> = emptyList()
        set(value) {
            field = value
            requestModelBuild()
        }

    override fun buildModels() {

        headerItem {
            id("bill_payments_text")
            title("Bill Payments")
        }
        val models = utilityList.map {
            RecentlyActiveItemModel_()
                .id(it.id)
                .profile(it)
        }
        //use model 2
        carousel {
            id("recent")
            padding(Carousel.Padding.dp(64, 4, 0, 0, 0))
            models(models)
        }
        carousel {
            id("recent2")
            padding(Carousel.Padding.dp(64, 0, 0, 0, 0))
            models(models)
        }

        headerItem {
            id("shop_and_order_text")
            title("Shop and Order")
        }
        val shopModels = shopList.map {
            ShopAndOrderModel_()
                .id(it.id)
                .message(it)
        }

        carousel {
            id("recent3")
            padding(Carousel.Padding.dp(0, 0, 0, 0, 0))
            models(shopModels)
        }
        headerItem {
            id("special_deals_text")
            title("Special Deals")
        }

        val dealModels = dealList.map {
                SpecialDealsModel_()
                .id(it.id)
                .deal(it)
        }

        carousel {
            id("dealsCarousal")
            padding(Carousel.Padding.dp(0, 0, 0, 0, 0))
            models(dealModels)
        }


//        allMessages.forEach {
//            messageItem {
//                id(it.id)
//                message(it)
//            }
//        }
    }
}