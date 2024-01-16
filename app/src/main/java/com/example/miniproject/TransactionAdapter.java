package com.example.miniproject;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

    public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder> {

        private List<Transaction> transactionList;
        private Context context;

        public TransactionAdapter(Context context, List<Transaction> transactionList) {
            this.context = context;
            this.transactionList = transactionList;

        }

        @NonNull
        @Override
        public TransactionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item1, parent, false);
            return new TransactionViewHolder(itemView);
        }


        @Override
        public void onBindViewHolder(@NonNull TransactionViewHolder holder, int position) {
            Transaction transaction = transactionList.get(position);

            holder.textDate.setText("Date: " + transaction.getDate());
            holder.textType.setText("Type: " + transaction.getType());
            holder.textAmount.setText("Amount: " + transaction.getAmount());
            holder.textBalance.setText("Balance: " + transaction.getBalance());
            holder.textAccount.setText("Account: " + transaction.getAccount());
        }

        @Override
        public int getItemCount() {
            return transactionList.size();
        }

        public static class TransactionViewHolder extends RecyclerView.ViewHolder {

            TextView textTransactionId;
            TextView textDate;
            TextView textType;
            TextView textAmount;
            TextView textBalance;
            TextView textAccount;

            public TransactionViewHolder(@NonNull View itemView) {
                super(itemView);
                textTransactionId = itemView.findViewById(R.id.textTransactionId);
                textDate = itemView.findViewById(R.id.textDate);
                textType = itemView.findViewById(R.id.textType);
                textAmount = itemView.findViewById(R.id.textAmount);
                textBalance = itemView.findViewById(R.id.textBalance);
                textAccount = itemView.findViewById(R.id.textAccount);
            }

            @SuppressLint("SetTextI18n")
            public void bind(Transaction transaction) {
                textTransactionId.setText("Transaction ID: " + transaction.getId());
                textDate.setText("Date: " + transaction.getDate());
                textType.setText("Type: " + transaction.getType());
                textAmount.setText("Amount: $" + transaction.getAmount());
                textBalance.setText("Balance: $" + transaction.getBalance());
                textAccount.setText("Account: " + transaction.getAccount());
            }
        }
    }

