import { Component } from '@angular/core';
import { UserService } from './user.service';
import jspdf, {jsPDF} from 'jspdf'; 
import html2canvas from 'html2canvas'; 
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'formProject';
  uploadedFile: File | null = null;
  isEditMode = true;
  constructor(private service:UserService)
  {  }
  
  user = {
    companyNameExisting: '',
    countryOfIncorporation: '',
    streetDetails: '',
    contactPersonName: '',
    countryCode: '',
    country: '',
    city: '',
    customerRequest: '',
    companyNameNew: '',
    address: '',
    companyWebsite: '',
    emailAddress: '',
    contactNumber: '',
    state: '',
    pincode: '',
    proofOfIdentity: '',
  };
  formData ='';

  editMode(): void {
    this.isEditMode = true;
    console.log("editing process going on"); 
  }

  saveChanges(): void {
    // Implement your logic to save changes
    this.isEditMode = false;
  }

  cancelEdit(): void {
    this.isEditMode = false;
  }

  onSubmit(): void {
    // Implement your logic for form submission
    console.log('Form submitted', this.user);
    // Assuming createUser method in the service is responsible for creating a user
    this.service.createUser(this.user).subscribe(
      (response) => {
        console.log('Form created successfully:', response);
        // You can handle success actions if needed
      },
      (error) => {
        console.error('Error creating form:', error);
        // You can handle error actions if needed
      }
    );
    
  }

  handleFileInput(event: any): void {
    const files = event.target.files;
    if (files.length > 0) {
      this.uploadedFile = files[0];
    }
  }

  generatePdf() {
    const elementToPrint = document.getElementById('content'); // element to become a pdf
  
    if (elementToPrint != null) {
      html2canvas(elementToPrint, {
        scale: 3,
        logging: true, // Enable logging to check for any issues
        useCORS: true, // Enable CORS to handle cross-origin content
        allowTaint: true, // Allow taint for images from other domains
        backgroundColor: 'white', // Set background color
      }).then((canvas) => {
        const pdf = new jspdf('p', 'mm', 'a4'); // specify 'a4' size for the PDF
        const pdfWidth = pdf.internal.pageSize.getWidth();
        const pdfHeight = pdf.internal.pageSize.getHeight();
        // Add image from canvas to PDF
        pdf.addImage(canvas.toDataURL('image/png'), 'PNG', 0, 0, pdfWidth, pdfHeight);
  
        // Set PDF properties
        pdf.setProperties({
          title: 'My PDF',
          subject: 'PDF from HTML with Angular',
          author: 'Vikram',
        });
  
        // Set font size and text
        pdf.setFontSize(12);
        pdf.text('Vikram', 14, 22);
  
        // Save the PDF with a specified filename
        pdf.save('myfile.pdf');
      });
    }
  }
  
  
}
  
  
