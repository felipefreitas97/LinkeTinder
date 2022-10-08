 class PessoaJuridicaTeste {
//Arrange

        boolean verificaEmpresa() {
            String nomeTeste = "nome"
            String emailTeste = "email"
            String cnpjTeste = "01.123.456/0001-99"
            String paisTeste = "BR"
            String estadoTeste = "GO"
            String descricaoTeste ="descricao"
            String cepTeste = "71414422"

//Act
            PessoaJuridica empresaA = new PessoaJuridica ("nome", "email", "01.123.456/0001-99", "BR", "GO", "71414422", "descricao",["Teste"])


//Assert
            return ((empresaA.nome == nomeTeste) &&
                    (empresaA.email == emailTeste) &&
                    (empresaA.descricao == descricaoTeste) &&
                    (empresaA.pais == paisTeste) &&
                    (empresaA.competenciaEmpresa == ["Teste"]) &&
                    (empresaA.cnpj == cnpjTeste) &&
                    (empresaA.estado == estadoTeste) &&
                    (empresaA.cep == cepTeste))

        }
    }

