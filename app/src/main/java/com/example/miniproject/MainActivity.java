package com.example.miniproject;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    List<Transaction> transactionList = new ArrayList<>();
    RecyclerView RecyclerViewTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        transaction();
        RecyclerViewTransaction = findViewById(R.id.RecyclerViewTransaction);
        RecyclerViewTransaction.setLayoutManager( new LinearLayoutManager(this));
        TransactionAdapter transactionAdapter = new TransactionAdapter(this, transactionList);
        RecyclerViewTransaction.setAdapter(transactionAdapter);
    }

    private void transaction() {

        transactionList.add(new Transaction(39806, "2023-01-24", TransactionType.DEBIT, 50.0, 950.0, 123456));

    }


}