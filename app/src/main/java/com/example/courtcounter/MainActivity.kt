package com.example.courtcounter

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.courtcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val TAG = "LifeCycleTest"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"onCreate() called")

        val scoreTeamA: TextView = findViewById(R.id.team_A_Score)
        val scoreTeamB: TextView = findViewById(R.id.team_B_Score)

        val addOnePointTeamA: Button = findViewById(R.id.one_point_a)
        val addTwoPointsTeamA: Button = findViewById(R.id.two_points_a)
        val addThreePointsTeamA: Button = findViewById(R.id.three_points_a)

        val addOnePointTeamB: Button = findViewById(R.id.one_point_b)
        val addTwoPointsTeamB: Button = findViewById(R.id.two_points_b)
        val addThreePointsTeamB: Button = findViewById(R.id.three_points_b)

        val reset: Button = findViewById(R.id.reset)

        addOnePointTeamA.setOnClickListener{
            val currentScore = scoreTeamA.text.toString().toInt()
            val newScore = currentScore + 1
            scoreTeamA.text = "$newScore"
        }

        addTwoPointsTeamA.setOnClickListener{
            val currentScore = scoreTeamA.text.toString().toInt()
            val newScore = currentScore + 2
            scoreTeamA.text = "$newScore"
        }

        addThreePointsTeamA.setOnClickListener{
            val currentScore = scoreTeamA.text.toString().toInt()
            val newScore = currentScore + 3
            scoreTeamA.text = "$newScore"
        }

        addOnePointTeamB.setOnClickListener{
            val currentScore = scoreTeamB.text.toString().toInt()
            val newScore = currentScore + 1
            scoreTeamA.text = "$newScore"
        }

        addTwoPointsTeamB.setOnClickListener{
            val currentScore = scoreTeamB.text.toString().toInt()
            val newScore = currentScore + 2
            scoreTeamA.text = "$newScore"
        }

        addThreePointsTeamB.setOnClickListener{
            val currentScore = scoreTeamB.text.toString().toInt()
            val newScore = currentScore + 3
            scoreTeamA.text = "$newScore"
        }

        reset.setOnClickListener{
            scoreTeamA.text = "0"
            scoreTeamB.text = "0"
        }
    }

    override fun onStart(){
        super.onStart()
        Log.d(TAG, "onStart() called")
    }

    override fun onResume(){
        super.onResume()
        Log.d(TAG, "onResume() called")
    }

    override fun onPause(){
        super.onPause()
        Log.d(TAG, "onPause() called")
    }

    override fun onStop(){
        super.onStop()
        Log.d(TAG, "onStop() called")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")
    }

    /*
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
    */
}