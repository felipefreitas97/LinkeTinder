class PessoaJuridica extends Pessoa {
    String Cnpj, Pais
    String CompetenciaEmpresa = []

    def setCompetenciaEmpresa (Competencia){
        CompetenciaEmpresa = Competencia
    }

    @Override
    public String toString (){
        return """Nome:${Nome}
Email:${Email}
CNPJ:${Cnpj}
País:${Pais} Estado:${Estado} CEP:${Cep}
Descrição pessoal:${Descricao}
Competências:${CompetenciaEmpresa}
"""

    }
}
