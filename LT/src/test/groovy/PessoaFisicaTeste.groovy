
class PessoaFisicaTeste {
//Arrange

    boolean verificaPessoa() {
        String nomeTeste = "nome"
        String emailTeste = "email"
        String cpfTeste = "123.456.789.01"
        String idadeTeste = "20"
        String estadoTeste = "GO"
        String descricaoTeste = "descricao"
        String cepTeste = "74123400"

        //PessoaFisica pessoaTest = new PessoaFisica("nome", "email", "123.456.789.01", "20", "GO", "descricao", ArrayTeste[0])
//Act
        PessoaFisica pessoaA = new PessoaFisica("nome", "email", "123.456.789.01", "20", "GO", "74123400", "descricao", ["Teste"])


//Assert
        boolean resultado = ((pessoaA.nome == nomeTeste) &&
                (pessoaA.email == emailTeste) &&
                (pessoaA.descricao == descricaoTeste) &&
                (pessoaA.idade == idadeTeste) &&
                (pessoaA.competenciaPessoa == ["Teste"]) &&
                (pessoaA.cpf == cpfTeste) &&
                (pessoaA.estado == estadoTeste) &&
                (pessoaA.cep == cepTeste))
        return resultado

    }
}