package br.edu.unifio.projetopdw.controladores;

import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
@Data
public class TrabalhoPar3Controlador {

            private Double metros;
            private Double calor;
            private Double BTU;


            public void CalculaBTU(){

                BTU = (metros * 600) + (300 * calor);


            }


}
