package ru.saumlaki.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    //Создание явного интента
    public void onSendMessage(View view) {

        TextView message = (TextView) findViewById(R.id.message);
        String textMessage = message.getText().toString();

        //Первый параметр от кого поступил интент
        //Второй - кому передать
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, textMessage);
        startActivity(intent);
    }

    //Создание не явного интента
    public void onSendMessageToSomeApp(View view) {

        TextView message = (TextView) findViewById(R.id.message);
        String textMessage = message.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, textMessage);
        intent.putExtra(Intent.EXTRA_SUBJECT, "Мой заголовок сообщения");
        startActivity(intent);
    }

    public void onSendToSomeAppChoose(View view) {

        TextView message = (TextView) findViewById(R.id.message);
        String textMessage = message.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, textMessage);
        intent.putExtra(Intent.EXTRA_SUBJECT, "Мой заголовок сообщения");
        startActivity(Intent.createChooser(intent, getString(R.string.title)));
    }
}