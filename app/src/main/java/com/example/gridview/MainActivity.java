package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.gridview.adapters.GridAdapter;
import com.example.gridview.model.GridArrayList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridView grid_view;
    private ArrayList<GridArrayList> arrayList;
    private GridAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid_view = findViewById(R.id.layout_gridView);
        arrayList = new ArrayList<>();

        arrayList.add(new GridArrayList(R.drawable.narnia, "Chronicles of Narnia","During the World War II bombings of London, four English siblings are sent to a country house where they will be safe. One day Lucy (Georgie Henley) finds a wardrobe that transports her to a magical world called Narnia. After coming back, she soon returns to Narnia with her brothers, Peter (William Moseley) and Edmund (Skandar Keynes), and her sister, Susan (Anna Popplewell). There they join the magical lion, Aslan (Liam Neeson), in the fight against the evil White Witch, Jadis (Tilda Swinton)."));
        arrayList.add(new GridArrayList(R.drawable.zathura_poster, "Zathura","After their father (Tim Robbins) is called into work, two young boys, Walter (Josh Hutcherson) and Danny (Jonah Bobo), are left in the care of their teenage sister, Lisa (Kristen Stewart), and told they must stay inside. Walter and Danny, who anticipate a boring day, are shocked when they begin playing Zathura, a space-themed board game, which they realize has mystical powers when their house is shot into space. With the help of an astronaut (Dax Shepard), the boys attempt to return home."));
        arrayList.add(new GridArrayList(R.drawable.snow_white, "Snow White and Huntsman","Betrayed by her evil sister Ravenna (Charlize Theron), heartbroken Freya (Emily Blunt) retreats to a northern kingdom to raise an army of huntsmen as her protectors. Gifted with the ability to freeze her enemies in ice, Freya teaches her young soldiers to never fall in love. When Eric (Chris Hemsworth) and fellow warrior Sara defy this rule, the angry queen does whatever she can to stop them. As war between the siblings escalates, Eric and Sara try to end Ravenna's wicked reign."));
        arrayList.add(new GridArrayList(R.drawable.gravity, "Gravity","Dr. Ryan Stone (Sandra Bullock) is a medical engineer on her first shuttle mission. Her commander is veteran astronaut Matt Kowalsky (George Clooney), helming his last flight before retirement. Then, during a routine space walk by the pair, disaster strikes: The shuttle is destroyed, leaving Ryan and Matt stranded in deep space with no link to Earth and no hope of rescue. As fear turns to panic, they realize that the only way home may be to venture further into space."));
        arrayList.add(new GridArrayList(R.drawable.harry_potter, "Harry Potter","Harry Potter, a boy who learns on his eleventh birthday that he is the orphaned son of two powerful wizards and possesses unique magical powers of his own. He is summoned from his life as an unwanted child to become a student at Hogwarts, an English boarding school for wizards. There, he meets several friends who become his closest allies and help him discover the truth about his parents' mysterious deaths."));
        arrayList.add(new GridArrayList(R.drawable.interstellar, "Intersteller","In Earth's future, a global crop blight and second Dust Bowl are slowly rendering the planet uninhabitable. Professor Brand (Michael Caine), a brilliant NASA physicist, is working on plans to save mankind by transporting Earth's population to a new home via a wormhole. But first, Brand must send former NASA pilot Cooper (Matthew McConaughey) and a team of researchers through the wormhole and across the galaxy to find out which of three planets could be mankind's new home."));
        arrayList.add(new GridArrayList(R.drawable.matrix, "Matrix","Neo (Keanu Reeves) believes that Morpheus (Laurence Fishburne), an elusive figure considered to be the most dangerous man alive, can answer his question -- What is the Matrix? Neo is contacted by Trinity (Carrie-Anne Moss), a beautiful stranger who leads him into an underworld where he meets Morpheus. They fight a brutal battle for their lives against a cadre of viciously intelligent secret agents. It is a truth that could cost Neo something more precious than his life."));
        arrayList.add(new GridArrayList(R.drawable.dragon, "Train your Dragon","Hiccup (Donald Reignoux) is a Norse teenager from the island of Berk, where fighting dragons are a way of life. His progressive views and weird sense of humor make him a misfit, despite the fact that his father (Emmanuel Jacomy) is chief of the clan. Tossed into dragon-fighting school, he endeavors to prove himself as a true Viking. When he befriends an injured dragon he names Toothless, he has the chance to plot a new course for his people's future."));
        arrayList.add(new GridArrayList(R.drawable.gladiator, "Gladiator","Set in Roman times, the story of a once-powerful general forced to become a common gladiator. The emperor's son is enraged when he is passed over as heir in favour of his father's favourite general. He kills his father and arranges the murder of the general's family, and the general is sold into slavery to be trained as a gladiator - but his subsequent popularity in the arena threatens the throne."));




        adapter = new GridAdapter(this,arrayList);
        grid_view.setAdapter(adapter);

        grid_view.setOnItemClickListener((adapterView, view, i, l) -> {

            Intent intent = new Intent(MainActivity.this,MovieDescription.class);
            intent.putExtra("grid_img",arrayList.get(i).getGrid_img());
            intent.putExtra("grid_title",arrayList.get(i).getImg_title());
            intent.putExtra("grid_desc", arrayList.get(i).getDescription());

            startActivity(intent);

        });
    }
}