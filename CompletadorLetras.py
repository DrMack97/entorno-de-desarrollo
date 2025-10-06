print("Completador de letras")
palabra = print("programacion")
letra = input("ingrese una letra: ")
posicion = int(input("ingrese la posicion donde quiere que se agregue la letra: "))
nueva_palabra = palabra[:posicion] + letra + palabra[posicion:]
print(f"la nueva palabra es: {nueva_palabra}")
