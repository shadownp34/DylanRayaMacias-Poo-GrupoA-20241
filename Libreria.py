class Libro:
    def __init__(self, titulo, autor):
        self.titulo = titulo
        self.autor = autor
        self.rentado_por = None

    def rentar(self, usuario):
        if not self.rentado_por:
            self.rentado_por = usuario
            return f"El libro '{self.titulo}' ha sido rentado por {usuario.nombre}."
        else:
            return f"El libro '{self.titulo}' ya esta rentado por {self.rentado_por.nombre}."

    def devolver(self):
        if self.rentado_por:
            usuario = self.rentado_por
            self.rentado_por = None
            return f"El libro '{self.titulo}' ha sido devuelto por {usuario.nombre}."
        else:
            return f"El libro '{self.titulo}' no se encuentra rentado ."

class Usuario:
    def __init__(self, nombre):
        self.nombre = nombre
        self.libros_rentados = []

    def rentar_libro(self, libro):
        mensaje = libro.rentar(self)
        if "rentado" in mensaje:
            self.libros_rentados.append(libro)
        return mensaje

    def devolver_libro(self, libro):
        mensaje = libro.devolver()
        if "devuelto" in mensaje:
            self.libros_rentados.remove(libro)
        return mensaje

class Libreria:
    def __init__(self):
        self.usuarios = []
        self.libros = []

    def registrar_usuario(self, nombre):
        usuario = Usuario(nombre)
        self.usuarios.append(usuario)
        return f"Usuario '{nombre}' registrado correctamente."

    def registrar_libro(self, titulo, autor):
        libro = Libro(titulo, autor)
        self.libros.append(libro)
        return f"Libro '{titulo}' de {autor} registrado correctamente."

    def listar_usuarios(self):
        return [usuario.nombre for usuario in self.usuarios]

    def listar_libros(self):
        return [(libro.titulo, libro.autor) for libro in self.libros]

    def listar_usuarios_con_libros(self):
        return [(usuario.nombre, [libro.titulo for libro in usuario.libros_rentados]) for usuario in self.usuarios]

    def listar_libros_no_rentados(self):
        return [(libro.titulo, libro.autor) for libro in self.libros if not libro.rentado_por]

    def listar_libros_rentados(self):
        return [(libro.titulo, libro.autor, libro.rentado_por.nombre) for libro in self.libros if libro.rentado_por]
