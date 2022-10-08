import java.util.List;

class ArrayPessoaTeste {
    boolean verificaArrayPessoas() {
//Arrange
        List<PessoaFisica> ListaPessoasTeste = []
        int resultadoEsperado = 2
        PessoaFisica pessoaTestA = new PessoaFisica("A", "A", "123.456.789.01", "99", "GO", "74123400", "descricao", ["A"])
        PessoaFisica pessoaTestB = new PessoaFisica("B", "B", "123.456.789.01", "99", "GO", "74123400", "descricao", ["B"])
//Act
        ListaPessoasTeste << pessoaTestA
        ListaPessoasTeste << pessoaTestB
//Assert
        return (ListaPessoasTeste.size() == resultadoEsperado)
    }
}


