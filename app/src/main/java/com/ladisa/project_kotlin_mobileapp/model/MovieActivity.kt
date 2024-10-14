package com.ladisa.project_kotlin_mobileapp.model

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.salti.project_kotlin_mobileapp.R
import com.ladisa.project_kotlin_mobileapp.adapter.MovieAdapter
import java.util.ArrayList

class MovieActivity : AppCompatActivity() {

    private var recycleView: RecyclerView? = null
    private var movieAdapter: MovieAdapter? = null
    private var movieList: MutableList<ModelMovie> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_movie)

        movieList = ArrayList()
        recycleView = findViewById(R.id.rv_movie)
        movieAdapter= MovieAdapter(this, movieList)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(
            this, 2
        )
        recycleView!!.layoutManager= layoutManager
        recycleView!!.adapter = movieAdapter

        //kita buatkan isi data listnya
        prepareMovieList()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private fun prepareMovieList(){
        var movie = ModelMovie("Avatar", R.drawable.avatar)
        movieList.add(movie)
        movie = ModelMovie("Batman", R.drawable.batman)
        movieList.add(movie)
        movie = ModelMovie("End Game", R.drawable.end_game)
        movieList.add(movie)
        movie = ModelMovie("Hulk", R.drawable.hulk)
        movieList.add(movie)
        movie = ModelMovie("Inception", R.drawable.inception)
        movieList.add(movie)
        movie = ModelMovie("Jumanji", R.drawable.jumanji)
        movieList.add(movie)
        movie = ModelMovie("Lucy", R.drawable.lucy)
        movieList.add(movie)
        movie = ModelMovie("Jurassic World", R.drawable.jurassic_world)
        movieList.add(movie)
        movie = ModelMovie("Spider Man", R.drawable.spider_man)
        movieList.add(movie)
        movie = ModelMovie("Venom", R.drawable.venom)
        movieList.add(movie)
        movieAdapter!!.notifyDataSetChanged()
    }
}