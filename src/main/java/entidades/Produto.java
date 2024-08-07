package entidades;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Produto {

    private Integer codigo;
    private  String nome;
    private Integer quantidade;
    private Double preco;
    private LocalDate validade;






}
