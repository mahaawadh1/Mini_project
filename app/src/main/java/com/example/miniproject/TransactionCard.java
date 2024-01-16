package com.example.miniproject;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

public class TransactionCard {

    @SuppressLint("SetTextI18n")
    public static View createTransactionCard(Context context, Transaction transaction) {
        View cardView = LayoutInflater.from(context).inflate(R.layout.item1, null);

        TextView textTransactionId = cardView.findViewById(R.id.textTransactionId);
        TextView textDate = cardView.findViewById(R.id.textDate);
        TextView textType = cardView.findViewById(R.id.textType);
        TextView textAmount = cardView.findViewById(R.id.textAmount);
        TextView textBalance = cardView.findViewById(R.id.textBalance);
        TextView textAccount = cardView.findViewById(R.id.textAccount);

        textTransactionId.setText("Transaction ID: " + transaction.getId());
        textDate.setText("Date: " + transaction.getDate());
        textType.setText("Type: " + transaction.getType());
        textAmount.setText("Amount: $" + transaction.getAmount());
        textBalance.setText("Balance: $" + transaction.getBalance());
        textAccount.setText("Account: " + transaction.getAccount());

        return cardView;
    }
}
