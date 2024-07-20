# Senha Segura - API de validação de senha

![GitHub repo size](https://img.shields.io/github/repo-size/andre-xizto/senha-segura?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/andre-xizto/senha-segura?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/andre-xizto/senha-segura?style=for-the-badge)
![Bitbucket open issues](https://img.shields.io/bitbucket/issues/andre-xizto/senha-segura?style=for-the-badge)
![Bitbucket open pull requests](https://img.shields.io/bitbucket/pr-raw/andre-xizto/senha-segura?style=for-the-badge)

> Este projeto é uma API que verifica a segurança da senha

### Ajustes e melhorias

O projeto foi desenvolvido com o intuito de ser uma resolução de um desafio do [Backend-br](https://github.com/backend-br/desafios/tree/master). Sinta-se a vontade para refatorar ou adicionar novas funcionalidades

## 💻 Pré-requisitos

Caso queira rodar este projeto na sua própria máquina, veja os requisitos abaixo:

- Java `21`

## 🚀 Instalando

Para instalar o Senha Segura, siga estas etapas:

1. Clone o repositório:
```
https://github.com/andre-xizto/senha-segura.git
```

2. Entre na pasta raiz do projeto
```
cd senha-segura
```

3. Execute o projeto com **Maven** ou **Gradle**
- Maven:
    - ```mvn spring-boot:run```
- Gradle:
    - ```gradle bootRun```
## ☕ Documentação Senha Segura

#### Retorna 201 se a senha for segura
#### Retorna 400 se a senha for insegura 

```http
  POST /check
```

| Parâmetro  | Tipo       | Descrição                               |
|:-----------| :--------- |:----------------------------------------|
| `password` | `string` | **Obrigatório**. Senha a ser verificada |

## 🤝 Colaboradores

Agradecemos às seguintes pessoas que contribuíram para este projeto:

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/andre-xizto/" title="GitHub de André Xisto" target="_blank">
        <img src="https://avatars.githubusercontent.com/u/35929740" width="100px;" alt="Foto do André Xisto no GitHub"/><br>
        <sub>
          <b>André Xisto</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

## 📝 Licença

Esse projeto está sob licença. Veja o arquivo [LICENÇA](LICENSE.md) para mais detalhes.