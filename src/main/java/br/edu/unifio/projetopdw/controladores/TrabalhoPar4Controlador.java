package br.edu.unifio.projetopdw.controladores;


import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
@Data
public class TrabalhoPar4Controlador {

            private Double horas;
            private Double minutos;
            private Double segundos;
            private Double result;

            public void CalculaSegundos(){

                result = (horas*3600) + (minutos*60) + segundos;


            }


}
