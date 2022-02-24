package com.example.ex03_recyclerview_fabriciodefreitaspassamani;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.ex03_recyclerview_fabriciodefreitaspassamani.Model.Nomes;

import java.util.ArrayList;
import java.util.List;

    public class Adaptador extends RecyclerView.Adapter<Adaptador.MyViewHolder> {
        private List<Nomes> adapterPessoas = new ArrayList<>();
        public Adaptador(List<Nomes> adapterPessoas) {
            this.adapterPessoas = adapterPessoas;
        }

        // Metodo chamado quando novos "itens" da lista são criados
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_drive, parent, false);
            return new MyViewHolder(itemLista);

        }

        // Metodo responsavel por popular os itens da lista
        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {

            Nomes nomes = adapterPessoas.get(position);
            holder.txtNome.setText(nomes.getNome());
            holder.posicao = position;

        }

        // Metodo que configura a quantidade de itens da lista
        @Override
        public int getItemCount() {
            return adapterPessoas.size();
        }


        // View Holder - Classe responsavel por configurar as View de cada um dos itens da lista.
        public class MyViewHolder extends RecyclerView.ViewHolder {

            TextView txtNome;
            ImageView imgExtras;
            int posicao;

            public MyViewHolder(View itemView) {
                super(itemView);

                txtNome = itemView.findViewById(R.id.txtNome);
                imgExtras = itemView.findViewById(R.id.imgExtras);


                //Listening
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(itemView.getContext(), "Deseja abrir " + adapterPessoas.get(posicao).getNome() + "?", Toast.LENGTH_LONG).show();
                    }
                });
                imgExtras.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(itemView.getContext(), "Opções Extras", Toast.LENGTH_LONG).show();
                    }
                });
            }
        }
    }
