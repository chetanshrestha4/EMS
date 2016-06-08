/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function addDepartment() {
       $('#departmentDialog').dialog("option", "title", 'Add Department');
       $('#departmentDialog').dialog('open');
}

function editDepartment(id) {

       $.get("get/" + id, function(result) {

              $("#departmentDialog").html(result);
              $('#departmentDialog').dialog("option", "title", 'Edit Department');
              $("#departmentDialog").dialog('open');

              initializeDatePicker();
       });
}

function initializeDatePicker() {
       $(".datepicker").datepicker({
              dateFormat : "yy-mm-dd",
              changeMonth : true,
              changeYear : true,
              showButtonPanel : true
       });
}

function resetDialog(form) {

       form.find("input").val("");
}

$(document).ready(function() {

       $('#departmentDialog').dialog({

              autoOpen : false,
              position : 'center',
              modal : true,
              resizable : false,
              width : 440,
              buttons : {
                     "Save" : function() {
                           $('#departmentForm').submit();
                     },
                     "Cancel" : function() {
                           $(this).dialog('close');
                     }
              },
              close : function() {

                     resetDialog($('#departmentForm'));
                     $(this).dialog('close');
              }
       });

       initializeDatePicker();
});
