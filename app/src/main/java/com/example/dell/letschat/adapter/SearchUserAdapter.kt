package com.example.dell.letschat.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.dell.letschat.R
import com.example.dell.letschat.model.User
import de.hdodenhof.circleimageview.CircleImageView
import android.view.LayoutInflater
import com.bumptech.glide.Glide


class SearchUserAdapter(val mUser: ArrayList<User>, val context: Context) :
    RecyclerView.Adapter<SearchUserAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val inflater = LayoutInflater.from(p0.context)
        val v = inflater.inflate(R.layout.search_by_id_row, p0, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return mUser.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val user: User = mUser[p1]
        p0.mProfileName.text = user.userName
        Glide.with(context).load(user.imageUrl).into(p0.mProfileImage)
/*        viewHolder.product_image.setOnClickListener(View.OnClickListener {
            myEventCallBack.onImageClickListener(
                productUpload
            )
        })*/
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val mProfileImage: CircleImageView
            get() = itemView.findViewById(R.id.profile_image)
        val mProfileName: TextView get() = itemView.findViewById(R.id.profile_name)
    }
}