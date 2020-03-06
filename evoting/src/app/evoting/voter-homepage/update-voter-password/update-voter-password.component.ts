import { Component, OnInit } from '@angular/core';
import { Voter } from 'app/model/voter.model';
import { VoterRepository } from 'app/model/voter.repository';
import { Router } from '@angular/router';

@Component({
  selector: 'app-update-voter-password',
  templateUrl: './update-voter-password.component.html',
  styleUrls: ['./update-voter-password.component.scss']
})
export class UpdateVoterPasswordComponent implements OnInit {

  constructor(private voter: Voter, private voterRepository: VoterRepository, private router: Router) {
  
   }
   newpassword;
   confirmpassword;
   oldpassword;

  confirmPassword(){
    // console.log(this.voterRepository.getVoter(Number(sessionStorage.getItem("user"))));
    
    if(this.newpassword == this.confirmpassword && this.voterRepository.getVoter(Number(sessionStorage.getItem("user"))).password == this.oldpassword){
      this.voter = this.voterRepository.getVoter(Number(sessionStorage.getItem("user")));
      this.voter.password = this.newpassword;
      this.voterRepository.updateVoterPassword(this.voter).subscribe();
      alert("Password Updated");
      this.router.navigate(['/voterhomepage']);
    }
    else{
      alert("Write correct credentials");
    }
    
  }
  ngOnInit() {
  }
  

}
