package com.example.assignment1imad
//These are the imports so that I can access the activity main components.
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //These are just defining the components in the activity main so that they can be used in code.
        //They are bound to val as they do not need to be changed and are constant.
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val textView = findViewById<TextView>(R.id.textView2)
        val editText = findViewById<EditText>(R.id.editTextNumber)

        btnClear.setOnClickListener {//When the user clicks the button Clear this function will begin.
            textView.text = ""//This clears the text in the text view so that the user can enter another historical figure.
        }

        btnGenerate.setOnClickListener {//When the user clicks the button generate history this function will begin.
            val message = when (editText.text.toString()) { //This take the user input and compares it to list of ages if the ages.
                //These are a list of historical figures that can be displayed.
                "56" -> "Ludwig van Beethoven German composer and pianist who is widely " +
                        "regarded as one of the greatest composers in the history of western music"

                "66" -> "Marie Curie Polish French physicist chemist who conducted pioneering " +
                        "research on radioactivity and discovered the elements podium and radium"

                "67" -> "Leonardo da Vinci Italian polymath known for his contributions to art " +
                        "science and anatomy"

                "73" -> "Charles Darwin English naturalist known for his theory of evolution by " +
                        "natural selection"

                "75" -> "Alexander Graham Bell Scottish born inventor and scientist credited with " +
                        "inventing the telephone and making contributions to communication technology"

                "76" -> "Albert Einstein German born theoretical physicist know for developing the " +
                        "theory of relativity and his mass energy equivalence formula"

                "77" -> "Galileo Galilei Italian astronomer,physicist and mathematician who made " +
                        "significant contributions to the development of modern science "

                "84" -> "Thomas edison American inventor and businessman who developed life around " +
                        "the world with the discovery of the light bulb and the motion picture"

                "86" -> "Nikola Tesla Serbian American inventor electrical engineer and futurist known" +
                        " for his contribution of alternating current electrical systems"

                "90" -> "British statesman army officer and writer who served as the prime minister" +
                        " of the United Kingdom during World War 2 "

                else -> "You entered an invalid age. " +//If the age the user entered was out of range an error message will be displayed -
                        "Try enter a number between 56 and 90"//instead and a hint for what they should enter is prompt.
            }
            textView.text = message //This outputs the message into the text view so tha the user can see it.
            }
        }

    }




