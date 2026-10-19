Carro meuCarro = garagem[0];
meuCarro.setAno(2025);

System.out.println("Ano pelo array: " + garagem[0].getAno());

// meuCarro e garagem[0] apontam para o mesmo objeto na memória.
// Por isso a mudança feita em um aparece no outro.