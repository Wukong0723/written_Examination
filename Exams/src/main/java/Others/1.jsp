<table border="1">
    <%!int k = 5;%>
    <tr>
        <td>序号</td>
        <td>字母</td>
    </tr>
    <%
        for (int i = 1; i < k; i += 2) {
    %>
    <tr>
        <td><%=(i + k)%>></td>
        <td><%=(char) ('Z' - i)%></td>
    </tr>
    <%
        }
    %>

</table>