package recyclerviewadapters

import android.view.LayoutInflater
import android.view.View
import com.bumptech.glide.request.RequestOptions
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.completeadapterview.R
import dataModal.Contacts
import kotlinx.android.synthetic.main.contact_design_horizontal.view.*

class RecyclerViewHorizontalAdapter:RecyclerView.Adapter<RecyclerView.ViewHolder>(){
   private var items:MutableList<Contacts> = ArrayList()
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ContactViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.contact_design_horizontal, parent, false)
        )
    }

    override fun getItemCount(): Int {
       return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {

            is ContactViewHolder -> {
                holder.bind(items[position])
            }

        }
    }
    fun submitList(contactList: List<Contacts>){
        items = contactList as MutableList<Contacts>
    }

    class ContactViewHolder constructor(itemView: View):RecyclerView.ViewHolder(itemView){
    private val cImage:ImageView = itemView.circleImageView
   private val cName:TextView  = itemView.contactName
        fun bind(contactList:Contacts){
            cName.text = contactList.pName
            val requestOption = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
        Glide.with(itemView.context)
            .load(contactList.pImageUrl)
            .into(cImage)
        }



    }
}