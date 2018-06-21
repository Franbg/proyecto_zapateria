/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesvdc.acceso.zapateria.gestionzapateria;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author profesor
 */
@CrossOrigin
@RestController
@RequestMapping("/rest")
public class Controlador {
    
    // RepositorioClientes repositorioCliente;
    
    @Autowired
    RepositorioCliente repoClient;
    
    @Autowired
    RepositorioCodPos repoCodPos;
    
    @Autowired
    RepositorioClienteDireccion repoClientDirec;
    
    @Autowired
    RepositorioEmpleadoDireccion repoEmplDirec;
    
    @Autowired
    RepositorioEmpleado repoEmpl;

   // Get All Clientes
    @GetMapping("/clientes")
    public List<Cliente> getAllClientes() {
        return repoClient.findAll();
    }
    /*
    // Get a Single Client
    @GetMapping("/cliente/{id}")
    public Cliente getCliente(@PathVariable(value = "id") Long clienteId) {
        return repoClient.findById(clienteId)
                .orElseThrow(() -> new ResourceNotFoundException("Cliente", "id", clienteId));
    }
    */
    // Get All Codigos Postales
    @GetMapping("/codpos")
    public List<CodPos> getAllCodPos() {
        return repoCodPos.findAll();
    }
    
    // Get All Clientes Direcciones
    @GetMapping("/clientes/direcciones")
    public List<ClienteDireccion> getAllClientesDirecciones() {
        return repoClientDirec.findAll();
    }
    
    // Get All Empleados Direcciones 
    @GetMapping("/empleados/direcciones")
    public List<EmpleadoDireccion> getAllEmpleadosDirecciones() {
        return repoEmplDirec.findAll();
    }
    
    // Get All Empleados
    @GetMapping("/empleados")
    public List<Empleado> getAllEmpleados() {
        return repoEmpl.findAll();
    }
    
   /*
    // Get All Notes
    @GetMapping("/cliente/{id}")
    public List<ClienteDireccion> getDireccions(Long id) {
        return repoClient.();
    }
   */

    
}
