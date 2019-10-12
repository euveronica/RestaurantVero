<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#textboxid
{
    height:200px;
    width: 200px;
    grid-area: textarea;
    resize: vertical;
    overflow: auto;
}
body 
{
background-color:#FAEBD7;
}
</style>
</head>
<body>

<div align="center">
    <h2>Adauga Produs NOU</h2>
</div>

<form action="AddProductController" method = "POST">

<div align="center">
        <table>
        	<tr>
                <td>
                    <label><b>Nume Categorie</b></label>
                    </td>
                    <td>
                    <select id="numeCategorie" name="numeCategorie" >
 					 	<option value="gustari">Gustari</option>
  						<option value="ciorbe">Ciorbe</option>
  						<option value="salateSpeciale">Salate Speciale</option>
 						<option value="peste">Peste</option>
					</select>
                </td>
            </tr>
           
            <tr>
                <td>
                    <label><b>Nume Produs</b></label>
                </td>
                <td>
                    <input type="text" id="numeProdus" name="numeProdus"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label><b>Descriere Produs</b></label>
                </td>
                <td>
                    <input id="textboxid" type="text" 
                    placeholder="introdu descrierea!" maxlength="250" id="descriereProdus"
                    name="descriereProdus"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label><b>Pret Unitar</b></label>
                </td>
                <td>
                    <input type="number" step="0.01" id="pretUnitar" name="pretUnitar"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label><b>Stoc</b></label>
                </td>
                <td>
                    <input type="number"  id="nivelExistant" name="nivelExistant"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label><b>Numar Portii</b></label>
                </td>
                <td>
                    <input type="number" id="numarPortii" name="numarPortii"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label><b>Poza</b></label>
                </td>
                <td>
                    <input type="text" id="poza" name="poza"/>
                </td>
            </tr>
            <tr>
                <td colspan="2">
<%--                   // <input type="submit" onclick="submitForm()" value="ADD Client">--%>
                    <input type="submit" onclick="submitForm()" value="Adauga produs">
                </td>
            </tr>
        </table>
        
        </div>

</form>


</body>
</html>