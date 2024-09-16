/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fula_constructor_s.a.s;

/**
 *
 * @author RyZen 5 Pro
 */
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreatePDFExample {
    public static void main(String[] args) {
        // Usar JFileChooser para que el usuario elija la ruta
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar PDF como...");
        
        // Mostrar el cuadro de diálogo de guardar
        int userSelection = fileChooser.showSaveDialog(null);
        
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String dest = fileToSave.getAbsolutePath();

            // Asegurarse de que el archivo tenga la extensión .pdf
            if (!dest.toLowerCase().endsWith(".pdf")) {
                dest += ".pdf";
            }

            // Crear el documento
            Document document = new Document();
            try {
                // Crear un PdfWriter para escribir el archivo
                PdfWriter.getInstance(document, new FileOutputStream(dest));

                // Abrir el documento
                document.open();

                // Crear una tabla con 3 columnas
                PdfPTable table = new PdfPTable(3);
                table.setWidthPercentage(100); // Ancho de la tabla
                table.setWidths(new float[]{1, 1, 1}); // Definir el ancho de las columnas
                
                // Definir estilos de fuente
                Font titleFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.DARK_GRAY);
                Font normalFont = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL, BaseColor.DARK_GRAY);
                Font normalBoldFont = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD, BaseColor.DARK_GRAY);


                // Primera fila del encabezado (imagen y texto)
                // Insertar una imagen
                Image logo = Image.getInstance("src\\main\\java\\com\\mycompany\\fula_constructor_s\\a\\s\\img/Recurso 2.png");  // Cambia la ruta por tu imagen
                logo.scaleToFit(100, 50);
                PdfPCell cell1 = new PdfPCell(logo);
                cell1.setBorder(PdfPCell.BOX);
                cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cell1.setHorizontalAlignment(Element.ALIGN_CENTER); // Centrar la imagen en la celda
                cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(cell1);

                // Celda de texto del título
                PdfPCell cell2 = new PdfPCell(new Paragraph("INFORME DE VISITA TÉCNICA", titleFont));
                cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cell2.setBorder(PdfPCell.BOX);
                cell2.setBackgroundColor(BaseColor.LIGHT_GRAY);
                table.addCell(cell2);

                // Crear una tabla interna para cell3
                PdfPTable innerTable = new PdfPTable(1);
                innerTable.setWidthPercentage(100);

                // Celda para la fecha
                PdfPCell fechaCell = new PdfPCell(new Paragraph("7/08/2024",normalBoldFont));
                fechaCell.setBorder(PdfPCell.BOX);  // Añadir borde
                fechaCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                innerTable.addCell(fechaCell);

                // Celda para la versión
                PdfPCell versionLabelCell = new PdfPCell(new Paragraph("VERSIÓN",normalBoldFont));
                versionLabelCell.setBorder(PdfPCell.BOX);  // Añadir borde
                versionLabelCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                innerTable.addCell(versionLabelCell);

                // Celda para el número de versión
                PdfPCell versionNumberCell = new PdfPCell(new Paragraph("1",normalBoldFont));
                versionNumberCell.setBorder(PdfPCell.BOX);  // Añadir borde
                versionNumberCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                innerTable.addCell(versionNumberCell);

                // Añadir la tabla interna a cell3
                PdfPCell cell3 = new PdfPCell(innerTable);
                cell3.setBorder(PdfPCell.NO_BORDER);
                cell3.setBackgroundColor(BaseColor.LIGHT_GRAY);
                table.addCell(cell3);

                // Segunda fila
                // Crear una tabla interna para cell4
                PdfPTable innerTable2 = new PdfPTable(1);
                
                PdfPCell number = new PdfPCell(new Paragraph("ORDEN DE OBRA No", normalBoldFont));
                innerTable2.addCell(number);
                
                PdfPCell ubic = new PdfPCell(new Paragraph("UBICACION", normalBoldFont));
                innerTable2.addCell(ubic);
                
                // Añadir la tabla interna a cell4
                PdfPCell cell4 = new PdfPCell(innerTable2);
                cell4.setBorder(PdfPCell.NO_BORDER);
                cell4.setBackgroundColor(BaseColor.LIGHT_GRAY);
                table.addCell(cell4);
                
                // Crear una tabla interna para cell5
                PdfPTable innerTable3 = new PdfPTable(1);
                
                PdfPCell numberO = new PdfPCell(new Paragraph("084-134", normalFont));
                innerTable3.addCell(numberO);
                
                PdfPCell ubicO = new PdfPCell(new Paragraph("", normalFont));
                innerTable3.addCell(ubicO);
                
                // Añadir la tabla interna a cell5
                PdfPCell cell5 = new PdfPCell(innerTable3);
                cell5.setBorder(PdfPCell.NO_BORDER);
                table.addCell(cell5);
                
                // Crear una tabla interna para cell6
                PdfPTable innerTable4 = new PdfPTable(1);
                
                PdfPTable innerTable41 = new PdfPTable(2);
                PdfPCell fechai = new PdfPCell(new Paragraph("FECHA INICIO:", normalBoldFont ));
                fechai.setBackgroundColor(BaseColor.LIGHT_GRAY);
                innerTable41.addCell(fechai);
                
                PdfPCell fechaiO = new PdfPCell(new Paragraph("22/05/2024", normalFont ));
                innerTable41.addCell(fechaiO);
                
                PdfPCell cellfecha = new PdfPCell(innerTable41);
                cellfecha.setBorder(PdfPCell.NO_BORDER);
                innerTable4.addCell(cellfecha);
                                
                PdfPTable innerTable42 = new PdfPTable(2);
                PdfPCell fechaf = new PdfPCell(new Paragraph("FECHA FINAL:", normalBoldFont ));
                fechaf.setBackgroundColor(BaseColor.LIGHT_GRAY);
                innerTable42.addCell(fechaf);
                
                PdfPCell fechafO = new PdfPCell(new Paragraph("22/05/2024", normalFont ));
                innerTable42.addCell(fechafO);
                
                PdfPCell cellfechaf = new PdfPCell(innerTable42);
                cellfechaf.setBorder(PdfPCell.NO_BORDER);
                innerTable4.addCell(cellfechaf);
                
                // Añadir la tabla interna a cell6
                PdfPCell cell6 = new PdfPCell(innerTable4);
                cell6.setBorder(PdfPCell.NO_BORDER);
                table.addCell(cell6);
                

                // Tercera fila
                table.addCell(new PdfPCell(new Paragraph("UBICACIÓN")));
                table.addCell(new PdfPCell(new Paragraph("")));
                PdfPCell fechaFinal = new PdfPCell();
                fechaFinal.addElement(new Paragraph("FECHA FINAL:"));
                fechaFinal.addElement(new Paragraph("22/05/2024"));
                table.addCell(fechaFinal);

                // Añadir la tabla al documento
                document.add(table);

            } catch (DocumentException | IOException e) {
                e.printStackTrace();
            } finally {
                // Cerrar el documento
                document.close();
            }

            System.out.println("PDF creado exitosamente en: " + dest);
        } else {
            System.out.println("La acción de guardado fue cancelada por el usuario.");
        }
    }
}
