import { Component } from "react";
import Barra from "./barra";
import Clientes from "./clientes";
import FormularioCliente from "./formulario";
import Menu from "./menu";

type props = {
    textoApp: string
}
type state = {
    botao: string
}
class Painel extends Component<props, state> {
    constructor(props) {
        super(props)
        this.state = {
            botao: 'clientes'
        }
        this.selecionarBotao = this.selecionarBotao.bind(this)
    }
    public selecionarBotao(clique: string) {
        this.setState({
            botao: clique
        })
    }
    render() {
        let botao = this.state.botao
        if (botao === 'clientes') {
            return (
                <>
                    <Barra textoApp={this.props.textoApp} />
                    <Clientes />
                    <Menu selecionarBotao={this.selecionarBotao} />
                </>
            )
        } else {
            return (
                <>
                    <Barra textoApp={this.props.textoApp} />
                    <FormularioCliente />
                    <Menu selecionarBotao={this.selecionarBotao} />
                </>
            )
        }

    }
}
export default Painel