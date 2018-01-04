import * as React from 'react';

interface LogoImageProps {
    codigo: string;
    denominacion: string;
}

class LogoImage extends React.Component<LogoImageProps, any> {
    constructor(props: LogoImageProps) {
        super(props);
        this.state = {
            logoUrl: '',
            isLoading: false
        };
    }

    componentDidMount() {
        const logoApi = 'http://www.bcra.gob.ar/Imagenes/logosbancos/';
        const extension = '.jpg';
        this.setState({logoUrl: logoApi + this.props.codigo + extension, isLoading: false});
    }

    render() {
        const {logoUrl, isLoading} = this.state;

        if (isLoading) {
            return <p>Cargando imagen...</p>;
        }

        return (
            <img src={logoUrl} alt={this.props.denominacion} width="200"/>
        );
    }
}

export default LogoImage;