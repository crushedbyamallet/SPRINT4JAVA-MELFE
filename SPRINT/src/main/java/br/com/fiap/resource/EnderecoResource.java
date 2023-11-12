package br.com.fiap.resource;

import br.com.fiap.bo.EnderecoBO;
import br.com.fiap.beans.Endereco;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import java.sql.SQLException;
import java.util.ArrayList;

@Path("/endereco")
public class EnderecoResource {

    private EnderecoBO enderecoBO;

    public EnderecoResource() throws SQLException, ClassNotFoundException {
        this.enderecoBO = new EnderecoBO();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Endereco> buscar() throws SQLException {
        return enderecoBO.selecionar();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response cadastroRs(Endereco endereco, @Context UriInfo uriInfo) throws SQLException {
        enderecoBO.inserir(endereco);
        UriBuilder builder = uriInfo.getAbsolutePathBuilder();
        builder.path(Integer.toString(endereco.getId()));
        return Response.created(builder.build()).build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizaRs(Endereco endereco, @PathParam("id") int id) throws SQLException {
        endereco.setId(id);
        enderecoBO.atualizar(endereco);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteRs(@PathParam("id") int id) throws SQLException {
        enderecoBO.deletar(id);
        return Response.ok().build();
    }
}
