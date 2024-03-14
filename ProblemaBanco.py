class CuentaBancaria:
  def __init__(self, tipo_cuenta, saldo_inicial):
      self.tipo_cuenta = tipo_cuenta
      if tipo_cuenta not in ['A', 'B', 'C']:
          print("Tipo de cuenta no válido. Debe ser A, B o C.")
          return
      if tipo_cuenta == 'A' and saldo_inicial > 50000:
          print("El saldo inicial máximo para una cuenta tipo A es $50,000.")
          return
      elif tipo_cuenta == 'B' and saldo_inicial > 100000:
          print("El saldo inicial máximo para una cuenta tipo B es $100,000.")
          return
      self.saldo = saldo_inicial

  def depositar(self, monto):
      if monto <= 0:
          print("El monto a depositar debe ser mayor que cero.")
          return
      if self.tipo_cuenta == 'A' and self.saldo + monto > 50000:
          print("El saldo máximo para este tipo de cuenta es $50,000.")
          return
      elif self.tipo_cuenta == 'B' and self.saldo + monto > 100000:
          print("El saldo máximo para este tipo de cuenta es $100,000.")
          return
      self.saldo += monto
      print(f"Se ha depositado ${monto} en la cuenta.")

  def retirar(self, monto):
      if monto <= 0:
          print("El monto a retirar debe ser mayor que cero.")
          return
      if self.saldo - monto < 0:
          print("No hay suficiente saldo en la cuenta.")
          return
      if self.tipo_cuenta == 'A' and self.saldo - monto < 1000:
          print("El saldo mínimo para este tipo de cuenta es $1,000.")
          return
      elif self.tipo_cuenta == 'B' and self.saldo - monto < 5000:
          print("El saldo mínimo para este tipo de cuenta es $5,000.")
          return
      elif self.tipo_cuenta == 'C' and self.saldo - monto < 10000:
          print("El saldo mínimo para este tipo de cuenta es $10,000.")
          return
      self.saldo -= monto
      print(f"Se ha retirado ${monto} de la cuenta.")

  def get_tipo_cuenta(self):
      return self.tipo_cuenta

  def get_saldo(self):
      return self.saldo


class Empleado:
  def __init__(self, nombre):
      self.nombre = nombre
      self.cuentas = []

  def agregar_cuenta(self, cuenta):
      self.cuentas.append(cuenta)

  def get_nombre(self):
      return self.nombre

  def get_cuentas(self):
      return self.cuentas


class Banco:
  def __init__(self):
      self.cuentas_bancarias = []

  def agregar_cuenta(self, cuenta):
      self.cuentas_bancarias.append(cuenta)

  def listar_todas_las_cuentas(self):
      for cuenta in self.cuentas_bancarias:
          print("Tipo de cuenta:", cuenta.get_tipo_cuenta())
          print("Saldo:", cuenta.get_saldo())
          print()

  def mostrar_cuenta(self, tipo_cuenta):
      for cuenta in self.cuentas_bancarias:
          if cuenta.get_tipo_cuenta() == tipo_cuenta:
              print("Tipo de cuenta:", cuenta.get_tipo_cuenta())
              print("Saldo:", cuenta.get_saldo())
              return
      print("No se encontró ninguna cuenta con el tipo especificado.")


if __name__ == "__main__":
  banco = Banco()

  while True:
      print("1. Agregar cuenta bancaria")
      print("2. Listar todas las cuentas")
      print("3. Mostrar información de una cuenta")
      print("4. Salir")
      opcion = input("Seleccione una opción: ")

      if opcion == "1":
          tipo_cuenta = input("Ingrese el tipo de cuenta (A, B o C): ")
          saldo_inicial = float(input("Ingrese el saldo inicial: "))
          cuenta = CuentaBancaria(tipo_cuenta, saldo_inicial)
          banco.agregar_cuenta(cuenta)
          print("Cuenta bancaria agregada correctamente")

      elif opcion == "2":
          print("Listado de todas las cuentas bancarias:")
          banco.listar_todas_las_cuentas()

      elif opcion == "3":
          tipo_cuenta_mostrar = input("Ingrese el tipo de cuenta a mostrar: ")
          banco.mostrar_cuenta(tipo_cuenta_mostrar)

      elif opcion == "4":
          print("Saliendo del programa...")
          break

      else:
          print("Opción no válida")