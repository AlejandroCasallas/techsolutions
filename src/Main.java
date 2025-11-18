import Dependencias.*;
import Dependencias.Actores.*;
import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Empleado> empleados = new ArrayList<>();
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Proveedor> proveedores = new ArrayList<>();
    private static ArrayList<Producto> productos = new ArrayList<>();
    private static ArrayList<Proyecto> proyectos = new ArrayList<>();
    private static ArrayList<Region> regiones = new ArrayList<>();
    private static ArrayList<Sucursal> sucursales = new ArrayList<>();
    private static ArrayList<Oficina> oficinas = new ArrayList<>();
    private static ArrayList<Departamento> departamentos = new ArrayList<>();
    private static ArrayList<Contrato> contratos = new ArrayList<>();
    private static ArrayList<Factura> facturas = new ArrayList<>();
    private static ArrayList<Inventario> inventarios = new ArrayList<>();
    private static ArrayList<Nomina> nominas = new ArrayList<>();
    
    public static void main(String[] args) {
        System.out.println("🚀 Bienvenido a TECHSOLUTIONS");
        System.out.println("Sistema de Administración Empresarial");
        System.out.println("Iniciando sistema limpio...");
        
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1: gestionarEmpleados(); break;
                case 2: gestionarActores(); break;
                case 3: gestionarEstructura(); break;
                case 4: gestionarNegocios(); break;
                case 5: gestionarInventarios(); break;
                case 6: gestionarFinanzas(); break;
                case 7: mostrarReportes(); break;
                case 0: 
                    System.out.println("\n ¡Gracias por usar TECHSOLUTIONS!");
                    System.out.println("Sistema desarrollado para super administradores");
                    break;
                default: System.out.println(" Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);
        
        scanner.close();
    }
    
    private static void mostrarMenu() {
        System.out.println("\n=== TECHSOLUTIONS - SUPER ADMIN ===");
        System.out.println("1.  Gestionar Empleados");
        System.out.println("2.  Gestionar Actores (Clientes/Proveedores)");
        System.out.println("3.  Gestionar Estructura Organizacional");
        System.out.println("4.  Gestionar Negocios");
        System.out.println("5.  Gestionar Inventarios");
        System.out.println("6.  Gestionar Finanzas");
        System.out.println("7.  Ver Reportes");
        System.out.println("0. Salir");
        System.out.print("Seleccione opción: ");
    }
    
    private static void gestionarEmpleados() {
        int opcion;
        do {
            System.out.println("\n=== GESTIÓN DE EMPLEADOS ===");
            System.out.println("1. Ver todos los empleados");
            System.out.println("2. Agregar nuevo empleado");
            System.out.println("3. Buscar empleado");
            System.out.println("4. Eliminar empleado");
            System.out.println("0. Volver al menú principal");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1: mostrarEmpleados(); break;
                case 2: agregarEmpleado(); break;
                case 3: buscarEmpleado(); break;
                case 4: eliminarEmpleado(); break;
            }
        } while (opcion != 0);
    }
    
    private static void mostrarEmpleados() {
        System.out.println("\n=== LISTA DE EMPLEADOS ===");
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        for (Empleado emp : empleados) {
            System.out.println("\n" + emp);
            emp.trabajar();
        }
    }
    
    private static void agregarEmpleado() {
        System.out.println("\n=== AGREGAR EMPLEADO ===");
        System.out.println("Tipo de empleado:");
        System.out.println("1. Presidente");
        System.out.println("2. Director");
        System.out.println("3. Gerente");
        System.out.println("4. Coordinador");
        System.out.println("5. Empleado Operativo");
        System.out.print("Seleccione tipo: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Salario: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();
        
        switch (tipo) {
            case 1:
                System.out.print("Estrategia: ");
                String estrategia = scanner.nextLine();
                empleados.add(new Presidente(id, nombre, salario, estrategia));
                break;
            case 2:
                System.out.print("Departamento: ");
                String departamento = scanner.nextLine();
                empleados.add(new Director(id, nombre, salario, departamento));
                break;
            case 3:
                System.out.print("Tamaño del equipo: ");
                int equipoSize = scanner.nextInt();
                empleados.add(new Gerente(id, nombre, salario, equipoSize));
                break;
            case 4:
                System.out.print("Área: ");
                String area = scanner.nextLine();
                empleados.add(new Coordinador(id, nombre, salario, area));
                break;
            case 5:
                System.out.print("Turno: ");
                String turno = scanner.nextLine();
                empleados.add(new EmpleadoOperativo(id, nombre, salario, turno));
                break;
        }
        System.out.println(" Empleado agregado exitosamente!");
    }
    
    private static void buscarEmpleado() {
        System.out.print("Ingrese ID del empleado: ");
        String id = scanner.nextLine();
        for (Empleado emp : empleados) {
            if (emp.getId().equals(id)) {
                System.out.println("\n" + emp);
                return;
            }
        }
        System.out.println("Empleado no encontrado.");
    }
    
    private static void eliminarEmpleado() {
        System.out.print("Ingrese ID del empleado a eliminar: ");
        String id = scanner.nextLine();
        empleados.removeIf(emp -> emp.getId().equals(id));
        System.out.println(" Empleado eliminado (si existía).");
    }
    
    private static void gestionarActores() {
        int opcion;
        do {
            System.out.println("\n=== GESTIÓN DE ACTORES ===");
            System.out.println("1. Gestionar Clientes");
            System.out.println("2. Gestionar Proveedores");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1: gestionarClientes(); break;
                case 2: gestionarProveedores(); break;
            }
        } while (opcion != 0);
    }
    
    private static void gestionarClientes() {
        int opcion;
        do {
            System.out.println("\n=== CLIENTES ===");
            System.out.println("1. Ver clientes");
            System.out.println("2. Agregar cliente");
            System.out.println("3. Eliminar cliente");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    for (Cliente c : clientes) {
                        System.out.println(c);
                        c.gestionarActividad();
                    }
                    break;
                case 2:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = scanner.nextLine();
                    System.out.print("ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();
                    clientes.add(new Cliente(nombre, direccion, id, telefono));
                    System.out.println("✅ Cliente agregado!");
                    break;
                case 3:
                    System.out.print("ID del cliente a eliminar: ");
                    String idElim = scanner.nextLine();
                    clientes.removeIf(c -> c.getId().equals(idElim));
                    System.out.println(" Cliente eliminado!");
                    break;
            }
        } while (opcion != 0);
    }
    
    private static void gestionarProveedores() {
        int opcion;
        do {
            System.out.println("\n=== PROVEEDORES ===");
            System.out.println("1. Ver proveedores");
            System.out.println("2. Agregar proveedor");
            System.out.println("3. Eliminar proveedor");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    for (Proveedor p : proveedores) {
                        System.out.println(p);
                        p.gestionarActividad();
                    }
                    break;
                case 2:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = scanner.nextLine();
                    System.out.print("ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Especialidad: ");
                    String especialidad = scanner.nextLine();
                    proveedores.add(new Proveedor(nombre, direccion, id, especialidad));
                    System.out.println(" Proveedor agregado!");
                    break;
                case 3:
                    System.out.print("ID del proveedor a eliminar: ");
                    String idElim = scanner.nextLine();
                    proveedores.removeIf(p -> p.getId().equals(idElim));
                    System.out.println(" Proveedor eliminado!");
                    break;
            }
        } while (opcion != 0);
    }
    
    private static void gestionarEstructura() {
        int opcion;
        do {
            System.out.println("\n===  ESTRUCTURA ORGANIZACIONAL ===");
            System.out.println("1. Gestionar Regiones");
            System.out.println("2. Gestionar Sucursales");
            System.out.println("3. Gestionar Oficinas");
            System.out.println("4. Gestionar Departamentos");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1: gestionarRegiones(); break;
                case 2: gestionarSucursales(); break;
                case 3: gestionarOficinas(); break;
                case 4: gestionarDepartamentos(); break;
            }
        } while (opcion != 0);
    }
    
    private static void gestionarRegiones() {
        int opcion;
        do {
            System.out.println("\n=== REGIONES ===");
            System.out.println("1. Ver regiones");
            System.out.println("2. Agregar región");
            System.out.println("3. Eliminar región");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    if (regiones.isEmpty()) {
                        System.out.println(" No hay regiones registradas.");
                    } else {
                        for (Region r : regiones) System.out.println(r);
                    }
                    break;
                case 2:
                    System.out.print("ID de región: ");
                    String id = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("País: ");
                    String pais = scanner.nextLine();
                    regiones.add(new Region(id, nombre, pais));
                    System.out.println(" Región agregada!");
                    break;
                case 3:
                    System.out.print("ID de región a eliminar: ");
                    String idElim = scanner.nextLine();
                    regiones.removeIf(r -> r.getRegionId().equals(idElim));
                    System.out.println(" Región eliminada!");
                    break;
            }
        } while (opcion != 0);
    }
    
    private static void gestionarSucursales() {
        int opcion;
        do {
            System.out.println("\n=== SUCURSALES ===");
            System.out.println("1. Ver sucursales");
            System.out.println("2. Agregar sucursal");
            System.out.println("3. Eliminar sucursal");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    if (sucursales.isEmpty()) {
                        System.out.println(" No hay sucursales registradas.");
                    } else {
                        for (Sucursal s : sucursales) System.out.println(s);
                    }
                    break;
                case 2:
                    System.out.print("ID de sucursal: ");
                    String id = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = scanner.nextLine();
                    System.out.print("ID de región: ");
                    String regionId = scanner.nextLine();
                    sucursales.add(new Sucursal(id, nombre, direccion, regionId));
                    System.out.println(" Sucursal agregada!");
                    break;
                case 3:
                    System.out.print("ID de sucursal a eliminar: ");
                    String idElim = scanner.nextLine();
                    sucursales.removeIf(s -> s.getSucursalId().equals(idElim));
                    System.out.println(" Sucursal eliminada!");
                    break;
            }
        } while (opcion != 0);
    }
    
    private static void gestionarOficinas() {
        int opcion;
        do {
            System.out.println("\n=== OFICINAS ===");
            System.out.println("1. Ver oficinas");
            System.out.println("2. Agregar oficina");
            System.out.println("3. Eliminar oficina");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    if (oficinas.isEmpty()) {
                        System.out.println(" No hay oficinas registradas.");
                    } else {
                        for (Oficina o : oficinas) System.out.println(o);
                    }
                    break;
                case 2:
                    System.out.print("ID de oficina: ");
                    String id = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Capacidad: ");
                    int capacidad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("ID de sucursal: ");
                    String sucursalId = scanner.nextLine();
                    oficinas.add(new Oficina(id, nombre, capacidad, sucursalId));
                    System.out.println(" Oficina agregada!");
                    break;
                case 3:
                    System.out.print("ID de oficina a eliminar: ");
                    String idElim = scanner.nextLine();
                    oficinas.removeIf(o -> o.getOficinaId().equals(idElim));
                    System.out.println(" Oficina eliminada!");
                    break;
            }
        } while (opcion != 0);
    }
    
    private static void gestionarDepartamentos() {
        int opcion;
        do {
            System.out.println("\n=== DEPARTAMENTOS ===");
            System.out.println("1. Ver departamentos");
            System.out.println("2. Agregar departamento");
            System.out.println("3. Eliminar departamento");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    if (departamentos.isEmpty()) {
                        System.out.println(" No hay departamentos registrados.");
                    } else {
                        for (Departamento d : departamentos) System.out.println(d);
                    }
                    break;
                case 2:
                    System.out.print("ID de departamento: ");
                    String id = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("ID del director: ");
                    String directorId = scanner.nextLine();
                    System.out.print("Número de empleados: ");
                    int numEmpleados = scanner.nextInt();
                    departamentos.add(new Departamento(id, nombre, directorId, numEmpleados));
                    System.out.println(" Departamento agregado!");
                    break;
                case 3:
                    System.out.print("ID de departamento a eliminar: ");
                    String idElim = scanner.nextLine();
                    departamentos.removeIf(d -> d.getDepartamentoId().equals(idElim));
                    System.out.println(" Departamento eliminado!");
                    break;
            }
        } while (opcion != 0);
    }
    
    private static void gestionarNegocios() {
        int opcion;
        do {
            System.out.println("\n===  GESTIÓN DE NEGOCIOS ===");
            System.out.println("1. Gestionar Proyectos");
            System.out.println("2. Gestionar Contratos");
            System.out.println("3. Gestionar Productos");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1: gestionarProyectos(); break;
                case 2: gestionarContratos(); break;
                case 3: gestionarProductos(); break;
            }
        } while (opcion != 0);
    }
    
    private static void gestionarProyectos() {
        int opcion;
        do {
            System.out.println("\n=== PROYECTOS ===");
            System.out.println("1. Ver proyectos");
            System.out.println("2. Crear proyecto");
            System.out.println("3. Actualizar estado");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    if (proyectos.isEmpty()) {
                        System.out.println(" No hay proyectos registrados.");
                    } else {
                        for (Proyecto p : proyectos) System.out.println(p);
                    }
                    break;
                case 2:
                    System.out.print("ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Estado: ");
                    String estado = scanner.nextLine();
                    System.out.print("Presupuesto: ");
                    double presupuesto = scanner.nextDouble();
                    proyectos.add(new Proyecto(id, nombre, estado, presupuesto));
                    System.out.println(" Proyecto creado!");
                    break;
                case 3:
                    System.out.print("ID del proyecto: ");
                    String idProyecto = scanner.nextLine();
                    System.out.print("Nuevo estado: ");
                    String nuevoEstado = scanner.nextLine();
                    for (Proyecto p : proyectos) {
                        if (p.getId().equals(idProyecto)) {
                            p.setEstado(nuevoEstado);
                            System.out.println(" Estado actualizado!");
                            return;
                        }
                    }
                    System.out.println(" Proyecto no encontrado.");
                    break;
            }
        } while (opcion != 0);
    }
    
    private static void gestionarContratos() {
        int opcion;
        do {
            System.out.println("\n=== CONTRATOS ===");
            System.out.println("1. Ver contratos");
            System.out.println("2. Crear contrato");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    if (contratos.isEmpty()) {
                        System.out.println(" No hay contratos registrados.");
                    } else {
                        for (Contrato c : contratos) System.out.println(c);
                    }
                    break;
                case 2:
                    System.out.print("ID: ");
                    String id = scanner.nextLine();
                    System.out.print("ID Cliente: ");
                    String clienteId = scanner.nextLine();
                    System.out.print("Fecha inicio (YYYY-MM-DD): ");
                    String fechaInicio = scanner.nextLine();
                    System.out.print("Fecha fin (YYYY-MM-DD): ");
                    String fechaFin = scanner.nextLine();
                    System.out.print("Valor: ");
                    double valor = scanner.nextDouble();
                    contratos.add(new Contrato(id, clienteId, fechaInicio, fechaFin, valor));
                    System.out.println(" Contrato creado!");
                    break;
            }
        } while (opcion != 0);
    }
    
    private static void gestionarProductos() {
        int opcion;
        do {
            System.out.println("\n=== PRODUCTOS ===");
            System.out.println("1. Ver productos");
            System.out.println("2. Agregar producto");
            System.out.println("3. Actualizar precio");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    if (productos.isEmpty()) {
                        System.out.println(" No hay productos registrados.");
                    } else {
                        for (Producto p : productos) System.out.println(p);
                    }
                    break;
                case 2:
                    System.out.print("ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Categoría: ");
                    String categoria = scanner.nextLine();
                    productos.add(new Producto(id, nombre, precio, categoria));
                    System.out.println(" Producto agregado!");
                    break;
                case 3:
                    System.out.print("ID del producto: ");
                    String idProd = scanner.nextLine();
                    System.out.print("Nuevo precio: ");
                    double nuevoPrecio = scanner.nextDouble();
                    for (Producto p : productos) {
                        if (p.getId().equals(idProd)) {
                            p.setPrecio(nuevoPrecio);
                            System.out.println(" Precio actualizado!");
                            return;
                        }
                    }
                    System.out.println(" Producto no encontrado.");
                    break;
            }
        } while (opcion != 0);
    }
    
    private static void gestionarInventarios() {
        int opcion;
        do {
            System.out.println("\n===  GESTIÓN DE INVENTARIOS ===");
            System.out.println("1. Ver inventarios");
            System.out.println("2. Crear inventario");
            System.out.println("3. Agregar producto a inventario");
            System.out.println("4. Remover producto de inventario");
            System.out.println("5. Ver detalle de inventario");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1: mostrarInventarios(); break;
                case 2: crearInventario(); break;
                case 3: agregarProductoInventario(); break;
                case 4: removerProductoInventario(); break;
                case 5: verDetalleInventario(); break;
            }
        } while (opcion != 0);
    }
    
    private static void mostrarInventarios() {
        System.out.println("\n=== LISTA DE INVENTARIOS ===");
        for (Inventario inv : inventarios) {
            System.out.println(inv + " - Productos: " + inv.getProductos().size());
        }
    }
    
    private static void crearInventario() {
        System.out.print("ID del inventario: ");
        String id = scanner.nextLine();
        System.out.print("Nombre del almacén: ");
        String nombre = scanner.nextLine();
        inventarios.add(new Inventario(id, nombre));
        System.out.println(" Inventario creado!");
    }
    
    private static void agregarProductoInventario() {
        System.out.print("ID del inventario: ");
        String idInv = scanner.nextLine();
        System.out.print("ID del producto: ");
        String idProd = scanner.nextLine();
        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();
        
        for (Inventario inv : inventarios) {
            if (inv.getId().equals(idInv)) {
                inv.agregarProducto(idProd, cantidad);
                System.out.println(" Producto agregado al inventario!");
                return;
            }
        }
        System.out.println(" Inventario no encontrado.");
    }
    
    private static void removerProductoInventario() {
        System.out.print("ID del inventario: ");
        String idInv = scanner.nextLine();
        System.out.print("ID del producto: ");
        String idProd = scanner.nextLine();
        System.out.print("Cantidad a remover: ");
        int cantidad = scanner.nextInt();
        
        for (Inventario inv : inventarios) {
            if (inv.getId().equals(idInv)) {
                inv.removerProducto(idProd, cantidad);
                System.out.println(" Producto removido del inventario!");
                return;
            }
        }
        System.out.println(" Inventario no encontrado.");
    }
    
    private static void verDetalleInventario() {
        System.out.print("ID del inventario: ");
        String idInv = scanner.nextLine();
        
        for (Inventario inv : inventarios) {
            if (inv.getId().equals(idInv)) {
                System.out.println("\n" + inv);
                System.out.println("Productos en inventario:");
                for (Map.Entry<String, Integer> entry : inv.getProductos().entrySet()) {
                    System.out.println("  - " + entry.getKey() + ": " + entry.getValue() + " unidades");
                }
                return;
            }
        }
        System.out.println(" Inventario no encontrado.");
    }
    
    private static void gestionarFinanzas() {
        int opcion;
        do {
            System.out.println("\n===  GESTIÓN FINANCIERA ===");
            System.out.println("1. Gestionar Nóminas");
            System.out.println("2. Gestionar Facturas");
            System.out.println("3. Reporte Financiero");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1: gestionarNominas(); break;
                case 2: gestionarFacturas(); break;
                case 3: generarReporteFinanciero(); break;
            }
        } while (opcion != 0);
    }
    
    private static void gestionarNominas() {
        int opcion;
        do {
            System.out.println("\n=== NÓMINAS ===");
            System.out.println("1. Ver nóminas");
            System.out.println("2. Crear nómina");
            System.out.println("3. Agregar salario a nómina");
            System.out.println("4. Ver detalle de nómina");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    for (Nomina n : nominas) {
                        System.out.println(n + " - Total: $" + n.getTotalNomina());
                    }
                    break;
                case 2:
                    System.out.print("ID de nómina: ");
                    String id = scanner.nextLine();
                    System.out.print("Período (YYYY-MM): ");
                    String periodo = scanner.nextLine();
                    nominas.add(new Nomina(id, periodo));
                    System.out.println(" Nómina creada!");
                    break;
                case 3:
                    System.out.print("ID de nómina: ");
                    String idNom = scanner.nextLine();
                    System.out.print("ID del empleado: ");
                    String idEmp = scanner.nextLine();
                    System.out.print("Salario: ");
                    double salario = scanner.nextDouble();
                    
                    for (Nomina n : nominas) {
                        if (n.getNominaId().equals(idNom)) {
                            n.agregarSalario(idEmp, salario);
                            System.out.println(" Salario agregado!");
                            return;
                        }
                    }
                    System.out.println(" Nómina no encontrada.");
                    break;
                case 4:
                    System.out.print("ID de nómina: ");
                    String idDetalle = scanner.nextLine();
                    
                    for (Nomina n : nominas) {
                        if (n.getNominaId().equals(idDetalle)) {
                            System.out.println("\n" + n);
                            System.out.println("Salarios por empleado:");
                            for (Map.Entry<String, Double> entry : n.getSalarios().entrySet()) {
                                System.out.println("  - " + entry.getKey() + ": $" + entry.getValue());
                            }
                            System.out.println("Total nómina: $" + n.getTotalNomina());
                            return;
                        }
                    }
                    System.out.println(" Nómina no encontrada.");
                    break;
            }
        } while (opcion != 0);
    }
    
    private static void gestionarFacturas() {
        int opcion;
        do {
            System.out.println("\n=== FACTURAS ===");
            System.out.println("1. Ver facturas");
            System.out.println("2. Crear factura");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    if (facturas.isEmpty()) {
                        System.out.println(" No hay facturas registradas.");
                    } else {
                        for (Factura f : facturas) System.out.println(f);
                    }
                    break;
                case 2:
                    System.out.print("ID de factura: ");
                    String id = scanner.nextLine();
                    System.out.print("ID del cliente: ");
                    String clienteId = scanner.nextLine();
                    System.out.print("Fecha (YYYY-MM-DD): ");
                    String fecha = scanner.nextLine();
                    System.out.print("Subtotal: ");
                    double subtotal = scanner.nextDouble();
                    System.out.print("Impuestos: ");
                    double impuestos = scanner.nextDouble();
                    facturas.add(new Factura(id, clienteId, fecha, subtotal, impuestos));
                    System.out.println(" Factura creada!");
                    break;
            }
        } while (opcion != 0);
    }
    
    private static void generarReporteFinanciero() {
        double totalNominas = nominas.stream().mapToDouble(Nomina::getTotalNomina).sum();
        double totalFacturas = facturas.stream().mapToDouble(Factura::getTotal).sum();
        
        System.out.println("\n=== REPORTE FINANCIERO ===");
        System.out.println("Total en Nóminas: $" + String.format("%.2f", totalNominas));
        System.out.println("Total Facturado: $" + String.format("%.2f", totalFacturas));
        System.out.println("Utilidad Bruta: $" + String.format("%.2f", (totalFacturas - totalNominas)));
        System.out.println("Número de Facturas: " + facturas.size());
        System.out.println("Número de Nóminas: " + nominas.size());
    }
    
    private static void mostrarReportes() {
        System.out.println("\n===  REPORTES EMPRESARIALES ===");
        
        System.out.println("\n ESTADÍSTICAS GENERALES:");
        System.out.println("Total Empleados: " + empleados.size());
        System.out.println("Total Clientes: " + clientes.size());
        System.out.println("Total Proveedores: " + proveedores.size());
        System.out.println("Total Productos: " + productos.size());
        System.out.println("Total Proyectos: " + proyectos.size());
        System.out.println("Total Regiones: " + regiones.size());
        System.out.println("Total Sucursales: " + sucursales.size());
        System.out.println("Total Oficinas: " + oficinas.size());
        System.out.println("Total Departamentos: " + departamentos.size());
        System.out.println("Total Contratos: " + contratos.size());
        System.out.println("Total Facturas: " + facturas.size());
        System.out.println("Total Inventarios: " + inventarios.size());
        System.out.println("Total Nóminas: " + nominas.size());
        
        if (nominas.isEmpty() && facturas.isEmpty()) {
            System.out.println("\n No hay datos financieros aún. Comience agregando empleados y clientes.");
        } else {
            System.out.println("\n REPORTE FINANCIERO:");
            double totalNominas = nominas.stream().mapToDouble(Nomina::getTotalNomina).sum();
            double totalFacturas = facturas.stream().mapToDouble(Factura::getTotal).sum();
            System.out.println("Total en Nóminas: $" + String.format("%.2f", totalNominas));
            System.out.println("Total Facturado: $" + String.format("%.2f", totalFacturas));
            System.out.println("Utilidad Bruta: $" + String.format("%.2f", (totalFacturas - totalNominas)));
        }
    }
    

}