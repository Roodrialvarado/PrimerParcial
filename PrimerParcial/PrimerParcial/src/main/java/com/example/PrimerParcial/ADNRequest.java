package com.example.PrimerParcial;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor

public class ADNRequest {

    private String[] dna;

    public String[] getDna() {
        return dna;
    }

    public void setDna(String[] dna) {
        this.dna = dna;
    }
}
