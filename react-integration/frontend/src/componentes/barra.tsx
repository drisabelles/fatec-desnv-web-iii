import { Component } from "react";
import 'materialize-css/dist/css/materialize.min.css'

type props = {
    textoApp: string
}

class Barra extends Component<props> {
    render() {
        return (
            <>
                <div className="navbar-fixed">
                    <nav>
                        <div className="nav-wrapper teal accent-3" >
                            <a href="!#" className="brand-logo center">{this.props.textoApp}</a>
                        </div>
                    </nav>
                </div>
            </>

        )
    }
}
export default Barra