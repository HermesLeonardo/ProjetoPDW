package br.edu.unifio.projetopdw.controladores;

import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
@Data
public class TrabalhoPar2Controlador {

            private Double numero;
            private Double sucessor;
            private Double antecessor;
            private Double result;


            public void result(){

                sucessor = numero + 1;

                antecessor = numero - 1;

            }



}
