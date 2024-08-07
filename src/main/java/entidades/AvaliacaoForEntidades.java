package entidades;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AvaliacaoForEntidades {

    private Integer codigo;
    private String nome;
    private Integer CPF;
    private LocalDate datanasc;

    private String Rua;
    private Integer numeroCasa;
    private String Bairro;
    private String cidade;
    private Integer UF;
    private Integer CEP;
    private String complemento;






}
