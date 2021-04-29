package sg.edu.np.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.Replaceable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "Main Activity";

    public void update_follow_btn(User u, Button b){
        if (u.isFollowed()){
            b.setText(R.string.unfollow_btn);
        }
        else {
            b.setText(R.string.follow_btn);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView name = findViewById(R.id.name);
        TextView description = findViewById(R.id.description);
        Button follow = findViewById(R.id.follow);
        Button message = findViewById(R.id.message);

        User user = new User("Hello World!", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua", 1, false);

        name.setText(user.getName());
        description.setText(user.getDescription());
        update_follow_btn(user, follow);

        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean following = !user.isFollowed();
                user.setFollowed(following);
                update_follow_btn(user,  follow);
            }
        });

        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Message");
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}