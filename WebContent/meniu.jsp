<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
    <%@ page import="date.Produs" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Meniu Restaurantul Vedetelor  </title>
<script src="https://code.jquery.com/jquery-1.11.3.js"></script>
<script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<script src="https://code.jquery.com/jquery-1.9.1.js"></script>
</head>
<body align ="center">
<h1 style="font-size:60px;"> Restaurantul Vedetelor </h1>
<b style="color:red; font-size:30px;"> MENIU </b>
<br/>
<br/><br/>


<table id="tblExample" border=1  style="width:100%">
<tr>
	<th> Categorie</th>
	<th> Nume Produs</th>
	<th> Descriere Produs</th>
	<th> Pret Unitar</th>
	<th> Poza</th> 
	<th> Numar portii</th>
	<th> Adauga la comanda</th>
</tr>

<c:forEach var="produse" items="${produse}" >
<tr>
	<td style="background-color:Salmon;"> <b> ${produse.getNume_categorie()}</b></td>
	<td> ${produse.getNume_produs()} </td>
	<td> ${produse.getDescriere_produs()}</td>
	<td > ${produse.getPret_unitar()}</td>
	<td> <img src="images/index.jpg" width="24" height="16"> </td>  
	 <td> <input type="select" value=0> ${produse.getNumar_portii()}</td>
	<td><input type="button" value="adauga"> </td>

</tr>
</c:forEach>

</table> 
<script type="text/javascript">
    $(document).ready(function () {	
        $('#tblExample').each(function () {
            var Column_number_to_Merge = 1;
 
            // Previous_TD holds the first instance of same td. Initially first TD=null.
            var Previous_TD = null;
            var i = 1;
            $("tbody",this).find('tr').each(function () {
                // find the correct td of the correct column
                // we are considering the table column 1, You can apply on any table column
                var Current_td = $(this).find('td:nth-child(' + Column_number_to_Merge + ')');
                 
                if (Previous_TD == null) {
                    // for first row
                    Previous_TD = Current_td;
                    i = 1;
                } 
                else if (Current_td.text() == Previous_TD.text()) {
                    // the current td is identical to the previous row td
                    // remove the current td
                    Current_td.remove();
                    // increment the rowspan attribute of the first row td instance
                    Previous_TD.attr('rowspan', i + 1);
                    i = i + 1;
                } 
                else {
                    // means new value found in current td. So initialize counter variable i
                    Previous_TD = Current_td;
                    i = 1;
                }
            });
        });		
    });
</script>
<br/><br/>
<input type="button" align = "left" value="Trimite comanda">
</body>
</html>