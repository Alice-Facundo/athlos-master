package com.example.athlos.navigation 

class TrainingAdapter(private val trainingList: List<TrainingItem>) :
    RecyclerView.Adapter<TrainingAdapter.TrainingViewHolder>() {

    class TrainingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.iv_training_image)
        val titleView: TextView = itemView.findViewById(R.id.tv_training_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrainingViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_training_card, parent, false)
        return TrainingViewHolder(view)
    }

    override fun onBindViewHolder(holder: TrainingViewHolder, position: Int) {
        val currentItem = trainingList[position]
        holder.imageView.setImageResource(currentItem.imageResId)
        holder.titleView.text = currentItem.title
    }

    override fun getItemCount() = trainingList.size
}