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
import kotlinx.android.synthetic.main.contact_design.view.*

class RecyclerViewVerticalAdapter(private val itemClickListener: OnLinearContactClickListener?) :RecyclerView.Adapter<RecyclerView.ViewHolder>(){
   private var items:MutableList<Contacts> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ContactViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.contact_design, parent, false)
        )
    }

    override fun getItemCount(): Int {
       return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {

            is ContactViewHolder -> {
                if (itemClickListener != null) {
                    holder.bind(items[position],itemClickListener,position)
                }
            }

        }
    }
    fun submitList(contactList: List<Contacts>){
        items = contactList as MutableList<Contacts>
    }

    class ContactViewHolder constructor(itemView: View):RecyclerView.ViewHolder(itemView){
    private val cImage:ImageView = itemView.circleImageView
   private val cName:TextView  = itemView.contactName
        fun bind(contactList:Contacts,clickListener: OnLinearContactClickListener,position: Int){
            cName.text = contactList.pName
            val requestOption = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
        Glide.with(itemView.context)
            .load(contactList.pImageUrl)
            .into(cImage)

            itemView.setOnClickListener {
                clickListener.onItemClicked(contactList,position)
            }
        }
        }

    interface OnLinearContactClickListener{
        fun onItemClicked(contacts: Contacts,position: Int)
    }

    }


