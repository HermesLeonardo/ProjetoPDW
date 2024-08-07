package br.edu.unifio.projetopdw.controladores;


import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
@Data
public class CalculadoraControlador {

    private  Double PrimeiroNumero;
    private  Double SegundoNumero;
    private  Double Resultado;

    public void somar(){Resultado = PrimeiroNumero + SegundoNumero;}
    public void subtrair(){Resultado = PrimeiroNumero - SegundoNumero;}
    public void dividir(){Resultado = PrimeiroNumero / SegundoNumero;}
    public void multiplicar(){Resultado = PrimeiroNumero * SegundoNumero;}

    public void conversao() {



    }




}
