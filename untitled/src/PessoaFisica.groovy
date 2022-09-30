class PessoaFisica extends Pessoa{
    String Cpf,Idade
    def CompetenciaPessoa = []

    def setCompetenciaPessoa (Competencia){
        CompetenciaPessoa = Competencia
    }


    @Override
    public String toString (){
        return """Nome:${Nome}
Email:${Email}
CPF:${Cpf}
Idade:${Idade} Estado:${Estado} CEP:${Cep}
Descrição pessoal:${Descricao}
Competências:${CompetenciaPessoa}
"""

    }
}
